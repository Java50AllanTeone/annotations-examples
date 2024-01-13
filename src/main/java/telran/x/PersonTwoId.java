package telran.x;

import telran.reflect.Id;
import telran.reflect.Index;

public class PersonTwoId {
    @Id
    int id = 0;
    @Id
    String name;
    @Index
    int salary;
}
