package edu.sdmesa.cisc191;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.junit.jupiter.api.Test;

/**
 * @author Tasha Frankie
 * @author Allan Schougaard
 * 
 * @version 2.0
 * @see Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented
 *      Problem Solving.
 *      https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * @see Bechtold, S., Brannen, S., Link, J., Merdes, M., Philipp, M., Rancourt,
 *      J. D., & Stein, C. (n.d.). JUnit 5 user guide. JUnit 5.
 *      https://junit.org/junit5/docs/current/user-guide/
 */

class TestDataStructures
{
	@Test
	public void testLinkedList()
	{
		LinkedList<String> list = new LinkedList<String>();
		LinkedListProducer producer = new LinkedListProducer(list);
		LinkedListConsumer consumer = new LinkedListConsumer(list);
		assertEquals(true, list.isEmpty());

		producer.produce("1st");
		producer.produce("2nd");
		producer.produce("3rd");

		assertEquals("1st", consumer.consumeHead());
		assertEquals("3rd", consumer.consumeTail());
		assertEquals("2nd", consumer.consumeTail());
		assertEquals(true, list.isEmpty());
		
		assertNull(consumer.consumeHead());
		assertNull(consumer.consumeTail());
	}

//	@Test
//	public void testArrayList()
//	{
//		ArrayList<String> list = new ArrayList<String>();
//		ArrayListProducer producer = new ArrayListProducer(list);
//		ArrayListConsumer consumer = new ArrayListConsumer(list);
//		assertEquals(true, list.isEmpty());
//
//		producer.produce(0, "1st");
//		producer.produce(1, "3rd");
//		producer.produce(1, "2nd");
//
//		assertEquals("1st", consumer.consume());
//
//		producer.produce(1, "4th");
//
//		assertEquals("2nd", consumer.consume());
//		assertEquals("4th", consumer.consume());
//		assertEquals("3rd", consumer.consume());
//		assertEquals(true, list.isEmpty());
//		
//		assertNull(consumer.consume());
//	}

//	@Test
//	public void testQueue()
//	{
//      // In this scenario we are simulating a food ordering system
//		Queue<String> queue = new LinkedList<String>();
//		QueueProducer producer = new QueueProducer(queue);
//		QueueConsumer consumer = new QueueConsumer(queue);
//
//		assertEquals(true, queue.isEmpty());
//
//		producer.produce("Meal #1");
//		producer.produce("Meal #2");
//		producer.produce("Meal #3");
//
//		assertEquals("Meal #1", consumer.consume());
//		assertEquals("Meal #2", consumer.consume());
//
//		producer.produce("Meal #4");
//
//		assertEquals("Meal #3", consumer.consume());
//		assertEquals("Meal #4", consumer.consume());
//		assertEquals(true, queue.isEmpty());
//		
//		assertNull(consumer.consume());
//	}

//	@Test
//	public void testStack()
//	{
//      // In this scenario we are simulating a storage facility 
//      // where products are stored in stacks
//		Stack<String> stack = new Stack<String>();
//		StackProducer producer = new StackProducer(stack);
//		StackConsumer consumer = new StackConsumer(stack);
//
//		assertEquals(true, stack.isEmpty());
//
//		producer.produce("First");
//		producer.produce("2nd");
//		producer.produce("3rd");
//
//		assertEquals("3rd", consumer.consume());
//		assertEquals("2nd", consumer.consume());
//
//		producer.produce("Last");
//
//		assertEquals("Last", consumer.consume());
//		assertEquals("First", consumer.consume());
//		assertEquals(true, stack.isEmpty());
//		
//		assertNull(consumer.consume());
//	}
	
//	@Test
//	public void testPalindrome()
//	{
//		// In this scenario, use a queue and a stack 
//		// to see if a word is a palindrome
//		
//		char[] lol = {'l', 'o', 'l'};
//		assertTrue(Datastructure.isPalindrome(lol));
//		char[] car = {'c', 'a', 'r'};
//		assertFalse(Datastructure.isPalindrome(car));
//		char[] cabc = {'c', 'a', 'b', 'c'};
//		assertFalse(Datastructure.isPalindrome(cabc));
//		char[] racecar = "racecar".toCharArray();
//		assertTrue(Datastructure.isPalindrome(racecar));
//
//	}
	
//	@Test
//	public void testPhoneDirectory()
//	{
//		PhoneDirectory directory = new PhoneDirectory();
//		directory.setNumberForPerson("Alice", 1111);	
//		assertEquals(1111, directory.findNumberForPerson("Alice"));
//		assertEquals(null, directory.findNumberForPerson("Bob"));
//				
//		directory.setNumberForPerson("Bob", 2222);	
//		assertEquals(1111, directory.findNumberForPerson("Alice"));
//		assertEquals(2222, directory.findNumberForPerson("Bob"));
//		
//		directory.setNumberForPerson("Bob's cell", 3333);	
//		assertEquals(1111, directory.findNumberForPerson("Alice"));
//		assertEquals(2222, directory.findNumberForPerson("Bob"));
//		assertEquals(3333, directory.findNumberForPerson("Bob's cell"));
//
//		directory.setNumberForPerson("Bob", 4444);	
//		assertEquals(1111, directory.findNumberForPerson("Alice"));
//		assertEquals(4444, directory.findNumberForPerson("Bob"));
//		assertEquals(3333, directory.findNumberForPerson("Bob's cell"));
//
//	    directory.forget("Bob");	
//	    assertEquals(null, directory.findNumberForPerson("Bob"));
//	    assertEquals(1111, directory.findNumberForPerson("Alice"));
//	    assertEquals(3333, directory.findNumberForPerson("Bob's cell"));
//	    
//	    assertNull(directory.findNumberForPerson("Xavier"));
//	}
	
//	@Test
//	public void testSearchEngine()
//	{
//		// In this scenario we are creating an Internet search engine
//		// which returns multiple results for each search keyword
//		// Hint: this requires multiple data structures collaborating
//		SearchEngine goggles = new SearchEngine();
//		
//		goggles.add("ice cream", "http://mothersicecream.com");
//		assertTrue(goggles.search("ice cream") instanceof List);
//		assertEquals(1, goggles.search("ice cream").size());
//		goggles.add("ice cream", "http://notyourmothersicecream.com");
//		assertEquals(2, goggles.search("ice cream").size());
//		
//		goggles.add("car", "http://foundontheroaddead.com");
//		goggles.add("car", "http://cashanddrive.com");
//		goggles.add("car", "http://fancycar.com");
//		
//		assertTrue(goggles.search("ice cream").contains("http://notyourmothersicecream.com"));
//		assertTrue(goggles.search("ice cream").contains("http://mothersicecream.com"));
//		assertFalse(goggles.search("ice cream").contains("http://foundontheroaddead.com"));
//		assertFalse(goggles.search("ice cream").contains("http://fancycar.com"));
//		assertFalse(goggles.search("ice cream").contains("http://cashanddrive.com"));
//		
//		assertEquals(3, goggles.search("car").size());
//		assertTrue(goggles.search("car").contains("http://foundontheroaddead.com"));
//		assertTrue(goggles.search("car").contains("http://fancycar.com"));
//		assertTrue(goggles.search("car").contains("http://cashanddrive.com"));
//		assertFalse(goggles.search("car").contains("http://notyourmothersicecream.com"));
//		assertFalse(goggles.search("car").contains("http://mothersicecream.com"));
//		
//		assertNotNull(goggles.search("404"));
//		assertTrue(goggles.search("404") instanceof List);
//		assertEquals(0, goggles.search("404").size());
//		assertNotNull(goggles.search("404"));
//		assertTrue(goggles.search("404") instanceof List);
//
//		// Make sure malicious hackers cannot break your search engine
//		// so do not hand out your data structures. Hint: think of Harbor
//		// Hint: use a list constructor
//		goggles.search("car").clear();
//		assertEquals(3, goggles.search("car").size());	
//	}
	
}
