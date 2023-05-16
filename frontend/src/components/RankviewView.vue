<template>

    <v-data-table
        :headers="headers"
        :items="rankview"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'RankviewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            rankview : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/rankviews'))

            temp.data._embedded.rankviews.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.rankview = temp.data._embedded.rankviews;
        },
        methods: {
        }
    }
</script>

