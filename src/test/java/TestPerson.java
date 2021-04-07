import org.junit.Assert;
import org.junit.Test;
import personlab.Person;

public class TestPerson {

    @Test
    public void testConstructor(){
        //given
        String expectedName = "John Doe";
        Integer expectedAge = 21;
        Character expectedGender = 'M';

        //when
        Person person = new Person(expectedName,expectedAge,expectedGender);

        //then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Character actualGender = person.getGender();

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedGender, actualGender);
    }

    @Test
    public void testSetGender(){
        //given
        Person person = new Person();
        Character expected = 'M';

        //When
        person.setGender(expected);
        Character actual = person.getGender();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSetName(){
        //given
        Person person = new Person();
        String expectedName = "Josh";

        //When
        person.setName(expectedName);
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName,actualName);
    }

}
