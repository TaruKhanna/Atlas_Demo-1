package com.tatadigital.training;

import java.util.HashMap;

import org.testng.annotations.Test;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.tatadigital.training.api.PostQeeperLoginMethod;

public class APIQeeperTest extends AbstractTest {

	@Test(dataProvider = "DataProvider", priority = 0)
    @MethodOwner(owner = "shamika")
	@XlsDataSourceParameters(path = "xls/TDTraining.xlsx", sheet = "TestData", dsUid = "SC", executeColumn = "SC", executeValue = "01")
	public void qeeperLogin(HashMap<String,String>testDetails) throws Exception {
//        setCases("4555,54545");
		PostQeeperLoginMethod api = new PostQeeperLoginMethod();
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.validateResponseAgainstJSONSchema("src/test/resources/api/qeeper/_post/login_rs.json");
    }
	
    /*@Test(description = "JIRA#DEMO-0001")
    @MethodOwner(owner = "qpsdemo")
    public void testCreateUser() throws Exception {
        setCases("4555,54545");
        PostUserMethod api = new PostUserMethod();
        api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        api.callAPI();
        api.validateResponse();
    }

    @Test(description = "JIRA#DEMO-0002")
    @MethodOwner(owner = "qpsdemo")
    public void testCreateUserMissingSomeFields() throws Exception {
        PostUserMethod api = new PostUserMethod();
        api.getProperties().remove("name");
        api.getProperties().remove("username");
        api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        api.callAPI();
        api.validateResponse();
    }

    @Test(description = "JIRA#DEMO-0003")
    @MethodOwner(owner = "qpsdemo")
    public void testGetUsers() {
        GetUserMethods getUsersMethods = new GetUserMethods();
        getUsersMethods.expectResponseStatus(HttpResponseStatusType.OK_200);
        getUsersMethods.callAPI();
        getUsersMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethods.validateResponseAgainstJSONSchema("api/users/_get/rs.schema");
    }

    @Test(description = "JIRA#DEMO-0004")
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P1)
    public void testDeleteUsers() {
        DeleteUserMethod deleteUserMethod = new DeleteUserMethod();
        deleteUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteUserMethod.callAPI();
        deleteUserMethod.validateResponse();
    }
*/
}
