package telran.x;

import telran.reflect.Id;
import telran.reflect.Index;

public class PersonNormal {
    @Id
    int id = 0;
    @Index
    String name;
    @Index
    int salary;
}
