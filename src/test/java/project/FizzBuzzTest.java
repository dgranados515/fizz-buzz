package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {

    @Test
    public void shouldBeAbleToCreateFizzBuzzObject(){
        //arrange and action
        FizzBuzz underTest = new FizzBuzz();
        //assertion
        assertTrue(underTest != null);
    }
    @Test
    public void given1ShouldReturn1(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.interpret(1);
        assertEquals("1", result);
    }
    @Test
    public void given2ShouldReturn2(){
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(2);

        assertEquals("2", result);
    }
    @Test
    public void given3ShouldReturnFizz() {
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(3);

        assertEquals("Fizz", result);
    }
    @Test
    public void given4ShouldReturnFizz() {
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(4);

        assertEquals("4", result);
    }
    @Test
    public void given5ShouldReturnBuzz() {
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(5);

        assertEquals("Buzz", result);
    }
    @Test
    public void given6ShouldReturnFizz() {
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(6);

        assertEquals("Fizz", result);
    }
    @Test
    public void given10ShouldReturnBuzz() {
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(10);

        assertEquals("Buzz", result);
    }
    @Test
    public void given15ShouldReturnFizzBuzz() {
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(15);

        assertEquals("FizzBuzz", result);
    }

}
