import com.sun.btrace.annotations.*;
import static com.sun.btrace.BTraceUtils.*;
import com.sun.btrace.AnyType;

@BTrace
public class TracingScript {

    @OnMethod( clazz="/test.*/", method="/.*/" )
    public static void onEntry(@ProbeClassName String pcn, @ProbeMethodName String pmn, AnyType[] args  ) {
        println(concat( concat( pcn, ". "), concat( pmn , " ")));
    }

    @OnMethod( clazz="/test.*/", method="/.*/", location = @Location(Kind.RETURN) )
    public static void onExit(@ProbeClassName String pcn, @ProbeMethodName String pmn, @Return AnyType ret ) {
        print(concat( concat(pcn, ". "), concat(pmn , " Returned: ")));
        println( str(ret) );
        println();
    }
    
}