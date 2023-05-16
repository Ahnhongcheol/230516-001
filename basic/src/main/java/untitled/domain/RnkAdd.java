package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class RnkAdd extends AbstractEvent {

    private Long id;
    private String name;

    public RnkAdd(Rank aggregate) {
        super(aggregate);
    }

    public RnkAdd() {
        super();
    }
}
