package codingexamples.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ReadJsonExample {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        Student student = mapper.readValue(new File("sample/student.json"), Student.class);
        System.out.println(student);

        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new File("sample/output.json"), student);

        String json = "{ \"color\" : \"Black\", \"type\" : \"FIAT\" }";
        JsonNode jsonNode = mapper.readTree(json);
        String color = jsonNode.get("color").asText();
        // Output: color -> Black

//        String jsonCarArray =
//                "[{ \"color\" : \"Black\", \"type\" : \"BMW\" }, { \"color\" : \"Red\", \"type\" : \"FIAT\" }]";
//        List<Car> listCar = objectMapper.readValue(jsonCarArray, new TypeReference<List<Car>>(){}

        String json2 = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
        Map<String, Object> map
                = mapper.readValue(json, new TypeReference<Map<String,Object>>(){});

    }
}
