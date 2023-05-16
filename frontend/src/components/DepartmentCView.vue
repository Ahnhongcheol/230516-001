<template>

    <v-data-table
        :headers="headers"
        :items="departmentC"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'DepartmentCView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            departmentC : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/departmentCS'))

            temp.data._embedded.departmentCS.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.departmentC = temp.data._embedded.departmentCS;
        },
        methods: {
        }
    }
</script>

