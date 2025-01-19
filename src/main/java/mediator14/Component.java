package mediator14;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Abstract base class for components that communicate via a mediator.
 * <p>
 * This class is part of the Mediator design pattern and defines the common interface
 * for all components. Each component holds a reference to the mediator to enable
 * communication between components without direct dependencies.
 * </p>
 */
@Getter
@RequiredArgsConstructor
@SuppressWarnings("all")
public abstract class Component {
    /**
     * The mediator that facilitates communication between components.
     */
    protected final IMediator mediator;

    /**
     * Stores the most recent event for this component.
     */
    protected String event;

    /**
     * Sends an event to the mediator.
     *
     * @param event the event to send
     */
    public abstract void sendEvent(String event);

    /**
     * Receives an event from the mediator.
     *
     * @param event the event received
     */
    public abstract void receiveEvent(String event);
}
