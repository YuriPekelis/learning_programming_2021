import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonJson {
    public static void main(String[] args) {
        final JSONObject obj = new JSONObject(JSON_DATA);
        final JSONArray geodata = obj.getJSONArray("geodata");
    }

    public Object meth(List<Object> l1, int number) {
        if (l1.get(number) instanceof String) {
            return (String) l1.get(number);
        } else {
            return (Obj);
        }
    }
}
