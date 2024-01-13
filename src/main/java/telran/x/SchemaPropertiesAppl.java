package telran.x;

import telran.reflect.SchemaProperties;

public class SchemaPropertiesAppl {

    public static void main(String[] args) throws Exception {
        SchemaProperties.displayFieldProperties(new PersonNormal());

        try {
            SchemaProperties.displayFieldProperties(new PersonNoId());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            SchemaProperties.displayFieldProperties(new PersonTwoId());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
