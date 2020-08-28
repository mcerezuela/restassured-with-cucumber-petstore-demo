import main.OpenAPISpecificationDeserializer;
import model.OpenAPISpecification;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.Constants;
import utils.Utils;

@Test()
public class OpenAPISpecificationDeserializerTest {

    @Test
    public void deserializeTest() {
        String json = Utils.readFile(Constants.PET_STORE_JSON);
        OpenAPISpecification oas = OpenAPISpecificationDeserializer.deserialize(json);
        Assert.assertNotNull(oas);
    }
}
