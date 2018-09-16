package state;

/**
 * The main idea of State pattern is to allow the object 
 * for changing its behavior without changing its class.
 * Hence the state of the Object is changes.
 * 
 * It differes from the strategy pattern in the following ways :-
 * 
 *  State vs. Strategy Pattern
 *  
 *  Both design patterns are very similar, but their UML diagram is the same, 
 *  with the idea behind them slightly different.
 *  
 *  First, the strategy pattern defines a family of interchangeable algorithms. 
 *  Generally, they achieve the same goal, but with a different implementation, 
 *  for example, sorting or rendering algorithms.
 *  
 *  In state pattern, the behavior might change completely, based on actual state.
 *  
 *  Next, in strategy, the client has to be aware of the possible strategies to use and 
 *  change them explicitly. Whereas in state pattern, each state is linked to another 
 *  and create the flow as in Finite State Machine.
 *  
 *  Ref :- https://www.baeldung.com/java-state-design-pattern
 *  
 * @author choudshe
 *
 */
public interface PackageState {

	public void next(Packages pkg);
	public void previous(Packages pkg);
	public void printStatus();
}
