package example.hello;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<Map<String,String>, String> {

    @Override
    public String handleRequest(Map<String,String> input, Context context) {
        context.getLogger().log("Input: " + input);
       // System.out.println(context.getLogger().getClass().getName());
        System.out.println("Log Stream name :    "+context.getLogStreamName()+"  Log group name:  "+context.getLogGroupName());

        return "Hello " + input.get("name");
    }
}
