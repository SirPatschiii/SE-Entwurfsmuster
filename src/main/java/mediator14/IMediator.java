package mediator14;

/**
 * Interface for mediators that manage communication between components.
 * <p>
 * This interface is part of the Mediator design pattern and defines the contract
 * for concrete mediators.
 * </p>
 */
interface IMediator {
    /**
     * Notifies the mediator of an event from a component.
     *
     * @param event  the event name
     * @param sender the component that sent the event
     */
    void notify(String event, Component sender);
}
