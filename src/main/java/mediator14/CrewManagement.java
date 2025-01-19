package mediator14;

import lombok.extern.slf4j.Slf4j;

/**
 * A concrete component that represents the crew management department.
 * <p>
 * This class is part of the Mediator design pattern and communicates with other
 * components via the mediator.
 * </p>
 */
@Slf4j
@SuppressWarnings("all")
public class CrewManagement extends Component {
    /**
     * Constructs a CrewManagement component with the given mediator.
     *
     * @param mediator the mediator for communication
     */
    public CrewManagement(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void sendEvent(String event) {
        this.event = event;
        mediator.notify("Event from CrewManagement", this);
    }

    @Override
    public void receiveEvent(String event) {
        log.info("CrewManagement received: {}", event);
    }
}
