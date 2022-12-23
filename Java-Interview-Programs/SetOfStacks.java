/*
Stack of Plates: Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
threshold. Implement a data structure SetOfStacks that mimics this. SetO-fStacks should be
composed of several stacks and should create a new stack once the previous one exceeds capacity.
SetOfStacks. push() and SetOfStacks. pop() should behave identically to a single stack
(that is, pop () should return the same values as it would if there were just a single stack).


*/

class Stack {

	int[] arr;
	int top;

	Stack(int n) {
		this.arr = new int[n];
		this.top = -1;
	}

	boolean isEmpty() {
		return top == -1 ? true : false;

	}

	void push(int x) {
		arr[++top] = x;
	}

	int pop(int stackCount) {
		if (top == -1 && stackCount == 0) {
			throw new EmptyStackException();
		}

		return arr[top--];

	}
}

class SetOfStacks {
	int capacity;
	int filledCapacity;
	Stack stack;
	List<Stack> stacks;

	SetOfStacks(int capacity) {
		this.capacity = capacity;
		this.filledCapacity = 0;
		this.stack = new Stack(this.capacity);
		this.stacks = new ArrayList<>();
	}

	boolean push(int x) {
		if (capacity == filledCapacity) {
			stacks.add(stack);
			filledCapacity = 0;
			stack = new Stack(capacity);
		}
		stack.push(x);
		filledCapacity++;
		return true;
	}

	int pop() {
		if (stack.isEmpty() && stacks.size() != 0) {
			stack = stacks.get(stacks.size() - 1);
		}
		int a = stack.pop(stacks.size());
		filledCapacity--;
		if (stack.isEmpty()) {
			stacks.remove(stack);
			filledCapacity = 0;
		}
		return a;
	}

}