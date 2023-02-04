package faturamento;

import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

public class Application3 {

	public static void main(String[] args) {

		JSONParser jsonParser = new JSONParser();
		try(FileReader reader = new FileReader("dados_json.json")){
			
			Object obj = jsonParser.parse(reader);
			System.out.println(obj);

			JSONArray lista = (JSONArray) obj;
			
			lista.forEach(valorDia -> parserFaturamento((JSONObject) valorDia));
			
			
		} catch (Exception e){
			
		}
		
	}
	
	public static void parserFaturamento(JSONObject dado) {
		dado.get("dia");
		Integer.parseInt(dado.getString("valor").toString());
	}
	
}
