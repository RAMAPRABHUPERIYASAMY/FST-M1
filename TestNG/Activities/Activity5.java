package Activities;

public class Activity5<groups, run> {
    <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite parallel="false" name="Suite">
    <test name="Test">
    <groups>
        <run>
            <include name="HeaderTests" />
            <!--<exclude name="HeaderTests" />-->
        </run>
    </groups>
        <classes>
            <class name="session9.GroupsDemo"/>
            <class name="session9.DemoOne"/>
            <class name="session9.DemoTwo"/>
            <class name="session9.Activity5"/>
        </classes>
    </test> <!-- Test -->
</suite> <!-- Suite -->
}
