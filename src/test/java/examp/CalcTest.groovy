package example

class CalcTest extends spock.lang.Specification {
    def subject = new Calc()

    def "add calculate sum of 2 integers"() {
        expect: subject.add(1, 2) == 3
    }
}
