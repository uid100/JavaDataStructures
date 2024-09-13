# JavaDataStructures
 
Java Test Driven Development (TDD) project to exercise Java data structures with unit testing ( with **JUnit** )

<details>
  <summary><em>derived from CISC191DataStructures</em></summary>
 
![220px-MesaLogo](https://github.com/schougaard/SanDiegoMesaCISC191ProgrammingChallenges/assets/716243/334f6724-6afa-4198-9eff-7c49c472cd35)

# San Diego Mesa College CISC 191 Programming Challenges
Programming challenges for San Diego Community College CISC 191 Intermediate Java classes.

Created by
- Professor Dr. Tasha Frankie
- and Professor [Allan Schougaard](https://github.com/schougaard), San Diego Mesa College.

With contributions from: 
- Dom David,
- [Dan Sullivan](https://github.com/uid100)

</details>

## Assignment Overview

<details> 
    <summary>About Data Structures</summary>

 Data structures are needed in Java programming to store and organize data efficiently. They allow programmers to access and manipulate data quickly and easily, which is essential for writing efficient and scalable code.

There are many different data structures available in Java, each with its advantages and disadvantages. The choice of which data structure to use depends on the specific application. For example, if you need to store a large amount of data that needs to be accessed in a sequential order, you might use an array. If you need to store data that can be added or removed frequently, you might use a linked list.

Data structures are an essential part of Java programming. By understanding data structures and how to use them, you can write code that is efficient, scalable, and easy to maintain.

Here are some specific examples of how data structures are used in Java programming:

Arrays are used to store data in a sequential order. They are efficient for storing and accessing data that is accessed in a sequential order. For example, you might use an array to store the names of all the students in a class.

Linked lists are used to store data in a linked list. They are more flexible than arrays, but they are also less efficient for accessing data that is not stored in a sequential order. For example, you might use a linked list to store the history of all the websites that a user has visited.

Stacks are used to store data in a last-in, first-out (LIFO) order. They are often used to implement functions and procedures. For example, you might use a stack to store the call stack of a running program.

Queues are used to store data in a first-in, first-out (FIFO) order. They are often used to implement event handling and task scheduling. For example, you might use a queue to store the requests that are waiting to be processed by a server.

Trees are used to store data in a hierarchical order. They are often used to represent graphs and other data structures. For example, you might use a tree to store the file system of a computer.

Hash tables are used to store data in a hash table. They are often used to implement dictionaries and other data structures that require fast lookups. For example, you might use a hash table to store the words in a dictionary.

These are just a few examples of how data structures are used in Java programming. By understanding data structures and how to use them, you can write code that is efficient, scalable, and easy to maintain.

The goal of this programming assignment is to ask you to work with these different data structures and increase your awareness of their availability, behavior, and use. Familiarizing yourself with them will help you better consider how you might use them for your project.

<a href="https://youtu.be/3g9ppsMEaN4?si=ujamp8IlRAYA4sJU">click here for more!</a>

</details>

<details>
   <summary>Instructions</summary>

   <h3>Open the Project</h3>
   <ol>
    <li>From the **<> Code** dropdown link in the repository (above), download the Zip file to your computer.</li>
     <li>Extract the files to your working folder</li>
     <li>Open Eclipse and import the project.
         <ul>
          <li>You can use File>Import menu item or right-click in the Package Manager and choose Import.</li>
          <li>select General>Projects from Folder or Archive</li>
          <li>navigate into the project until you see the `bin` and `src` folders, and choose *open*</li>
         </ul>
     </li>
     <li>Expand the project in the package explorer and find the .java files below the **src** folder.</li>
   </ol>
     
   <h3>Complete the Assignment</h3>
   <p>Similar to previous assignments, you will use the tester class to guide you in completing this programming assignment along with this programming assignment guide.</p>
</details>


## Programming Task(s)

<details>
    <summary>TestLinkedList / TestArrayList</summary>

Each of the data structures you are going to use (not _write_) is utilized as instance variables in a consumer and producer class. For example, the **LinkedListConsumer** and **LinkedListProducer** classes will use a `LinkedList.` 

Let's start by getting the first tester method to compile. Currently, the constructors for **LinkedListConsumer** and **LinkedListProducer** are incomplete. Complete the header of the constructors as well as the body. Below is the example for the Producer. Since a constructor initializes instance variables (fields), this must mean that the **LinkedListProducer** class should have an instance variable to store the `LinkedList` being passed to the constructor. In total, the three highlighted sections should be added to the **LinkedListProducer** class. 

```
private LinkedList<String> list;

public LinkedListProducer(LinkedList<String> list) {
       this.list = list;
}
```

Perform similar steps for the **LinkedListConsumer**.

If it's not already obvious by the names, the producer classes for a data structure will add to the data structure and the consumer will removed from it! Complete the **produce** method of the producer. This method will add Links to an external site to the `LinkedList`. This is where you can spend some time looking at the `LinkedList` API. The alternative would be to use Eclipse's auto-suggest features when you use the dot operator on objects. You could go through the available methods to see how to add to a `LinkedList`.

Complete the consume methods of the consumer-related class for LinkedList. These methods will remove elements from the LinkedList at specific locations. Look through the available remove methodsLinks to an external site. of the LinkedList class. You can utilize any of these remove methods to accomplish removing from the desired locations. It's important to note that these remove methods also return the element that is removed from the list. This is what is returned by the consumer remove methods! If the list is empty or if the desired location is invalid, the remove methods of the consumer should return null;

Good news! If you understood the parts to pass the first tester method, the same steps are applied for the producer and consumer classes that use an `ArrayList`. Work on completing the `ArrayListConsumer` and `ArrayListProducer` classes. 

<a href="https://youtu.be/3g9ppsMEaN4?si=Df0cslsWpN8aw9Ay">LinkedList TesterMethod</a>

</details>

<details>
 <summary>testQueue / testStack</summary>

The `Queue`-related classes in this programming assignment are similar to the `ArrayList` and `LinkedList`. 

However, now you must also provide the required constructor headers. You will solve this using the same process!</p>

</details>

<details>
    <summary>testPalindrome</summary>

 A palindrome is a word spelled the same as forward and backward. For example, _racecar_ is spelled the same going left-to-right as it is going right-to-left! Other examples are _mom_, _civic_, _rotor_, and _radar_!
 
How can you use a `Queue` and a `Stack` to solve this problem? Removing from a `Stack` always removes from the "top" while removing from a `Queue` will always remove from the bottom!

1. Add the characters to the `Stack` and `Queue` data structures you create
2. remove all the characters one at a time from the `Stack` and `Queue` in each iteration of a loop structure
3. each iteration, check if the characters you removed from both data structures are the same!
4. if they are ever not equal then that means the characters do not appear in the same order forward and backward

</details>

<details>
   <summary>testPhoneDirectory</summary>

1. Work on getting the tester method to compile. Once you have uncommented the tester method for this section, you will see the need to create a `PhoneDirectory` class.
2. Add missing method headers and bodies including any temporary returns such as returning `null` or returning `-1` (as you have seen in previous programming assignments) in `PhoneDirectory` to clear the compile errors from missing methods.
3. Similar to the other classes, add a private instance variable for the required data structure. In this case, it will be a
<a href="https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html" target="_blank" rel="noopener">HashTable</a>. Import the required library through Eclipse Quickfix or by adding the import line above the class header line

```
//Required import line or use Eclipse Quickfix
import java.util.HashTable;

//Example Declaration and Instantiation of a HashTable:
HashTable<String, String> capitalCities = new HashTable<String, String>(); 
```

4. Complete the setter method (`setNumebrForPerson`) through the use of the [put](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#put-K-V-) method of a `HashTable`.
5. Complete the `findNumberForPerson` method by using the [get](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#get-java.lang.Object-) method of a `HashTable`. _Hint: You may need to cast the return of the `get` method to an Integer._
6. For the forget method, use the [remove](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#remove-java.lang.Object-) method of a `HashTable`.

_Hashtable [video demo](https://youtu.be/ewyZXIbokHM?si=1OslR6NGteRhkqrp) use if you need it_

</details>
        
<details>
   <summary>testSearchEngine</summary>
   <ol>
       <li>Uncomment the tester and work on getting the project to compile by adding the missing Java class and its bare-bone content similar to the steps taken for the previous testers in this programming assignment.</li>
       <li>This problem is somewhat similar to the `PhoneDirectory`. However, the `HashTable` entries in this particular class should be storing a list of elements rather than one value. The `HashTable` that you add as the instance variable should be using an appropriate data structure introduced in this module. Add the instance variable now.

```
//Example: Typical HashTable declaration and Instantiation  
HashTable<String, String> capitalCities = new HashTable<String, String>(); 

//Example: HashTable with a data structure, an array
HashTable<String, int[]> test = new HashTable<String, int[]>();
```

_**Do not use an array for your solution! Look at what type of data structure the tester towards the end of the tester method.**_

 </li>
 <li>You will see that the first two uses of the add method for `SearchEngine`will add two website links that are associated with <i>"ice cream". </i>This is the reason you need a data structure to hold the multiple entries for a given entry.&nbsp;
<ul>
<li>When adding an entry to the map, you should check if it exists. Look for the necessary method to do so.</li>
<li>If it <i>does </i>exist, alter the data structure so that you add to it instead of replacing the entire entry! Otherwise, add it as usual.</li>
</ul>
</li>

<li>The search method needs to return a copy of the original list that is stored in your data structure. Whatever you are returning here should be a copy. You do not want the actual data structure to be altered accidentally by code that performs a simple search. Revisit the `Harbor` class from a previous programming assignment if you need a reminder.</li>
                </ol>

        </details>

___________

## Complete and zip the project
1. Run and add the code to the src folder until the tests are successful.
2. Uncomment each test case in the **Test** file (`TestAdvancedClasses.java`), one at a time. 
Do not modify the content in this file except to uncomment the tests. Add and modify class files
as needed for the tests to pass.
3. Review and refactor any of the code as needed:
    - be sure your code follows good coding practices and coding style and standards.
    - update the javadoc comments at the top of the file to add your name as author
    - update the comments for each method in the file.
4. Export the project as a zip file and submit your work.

___________

## Rubric

[Rubric](Rubric.md)


___________

_this repository is a subset of the CISC191 exercises. It is derived from the CISC191ProgrammingChallenges 
activity hosted by Professor Allan Schougaard, San Diego Mesa College, and not a direct fork._

_This project is to decompose that repository into git submodules_
