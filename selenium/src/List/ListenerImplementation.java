package List;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation extends BaseClass implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getName();
		
		
	}

}
