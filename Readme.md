## Memory Flow

1. The `main()` method starts execution, and a stack frame is created in the Stack.

2. The reference variable `s1` is created in the Stack.

3. When `Student s1 = new Student();` is executed:
   - A `Student` object is created in the Heap.
   - The reference `s1` points to the Student object.
   - Instance variables are stored inside the Student object in the Heap.
   - Instance variables receive their default values.

4. The reference variable `sc` is created in the Stack.

5. When `Scanner sc = new Scanner(System.in);` is executed:
   - A Scanner object is created in the Heap.
   - The reference `sc` points to the Scanner object.

6. When `setDetails()` is called:
   - A new stack frame is created.
   - Parameters `name` and `courseName` are stored in that stack frame.
   - The values are assigned to the Student object's instance variables in the Heap.
   - After the method finishes, its stack frame is removed.

7. When `setProgress()` is called:
   - A new stack frame is created.
   - Parameters `completedTopics` and `questionsSolved` are stored in the stack frame.
   - The values are updated in the Student object in the Heap.
   - After the method finishes, its stack frame is removed.

8. When `displayDetails()` or `displayProgress()` is called:
   - A new stack frame is created.
   - The method accesses the Student object through the `s1` reference.
   - The required information is displayed.
   - The stack frame is removed after execution.

9. When `addTopics()` is called:
   - A stack frame is created.
   - The new topic count is received as a parameter.
   - The existing `completedTopics` value in the Heap is updated.
   - The updated value is returned.
   - The stack frame is removed after execution.

10. When `addQuestions()` is called:
    - A stack frame is created.
    - The new questions count is received as a parameter.
    - The existing `questionsSolved` value in the Heap is updated.
    - The updated value is returned.
    - The stack frame is removed after execution.

