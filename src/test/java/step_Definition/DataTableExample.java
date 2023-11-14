package step_Definition;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class DataTableExample {

	@Given("user has values in form of Key and Value")
	public void user_has_values_in_form_of_key_and_value(DataTable data) {
	   
		Map<String, String> asMap = data.asMap();
		
		for(String map:asMap.keySet())
		{
			System.out.println(map);
		}
		
		for(String value:asMap.values())
		{
			System.out.println(value);
		}
		
		for(Entry<String, String> en:asMap.entrySet())
		{
			System.out.println(en);
		}
		
		String name = asMap.get("Name");
		
		System.out.println(name);
		
		String ID = asMap.get("Id");
		
		System.out.println(ID);
		
		System.out.println("==============================");

	}
	
	@Given("user has multiple data for multiple heading")
	public void user_has_multiple_data_for_multiple_heading(DataTable data) {
	    
		
		List<Map<String, String>> asMaps = data.asMaps();
		
		for(Map<String,String> map:asMaps)
		{
			for(Entry<String, String> en:map.entrySet())
			{
				System.out.println("entry set " + en);
				
				 System.out.println("Key set value " + en.getKey());
				 
				 System.out.println("value set " + en.getValue());
				 
				 
				 if(en.getKey().equals("ID"))
				 {
					 System.out.println("value of ID " + en.getValue());
				 }
				
				 System.out.println("==============================");

				 if(en.getKey().equals("Name"))
				 {
					 System.out.println("value of Name " + en.getValue());
				 }
			}
		
		}
	}
}

