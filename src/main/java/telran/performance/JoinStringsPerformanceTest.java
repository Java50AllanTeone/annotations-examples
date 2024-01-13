package telran.performance;

public class JoinStringsPerformanceTest {
    private static final int N_STRINGS = 1000;
    static String[] strings;

    @BeforeAll
    static void createArray() {
        strings = new String[N_STRINGS];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = "String";
        }
    }

    @DisplayName(name = "Join Strings using standard method join")
//    @PerformanceTest(nRuns = 1000)
    void joinStringsStandard() {
        String.join(" ", strings);
    }

    @DisplayName(name = "Join Strings using class String")
    @PerformanceTest(nRuns = 10000)
    void joinStringsString() {
        joinByString();
    }

    private String joinByString() {
        String str = strings[0];

        for (int i = 1; i < N_STRINGS; i++) {
            str += " " + strings[i];
        }
        return str;
    }
}
