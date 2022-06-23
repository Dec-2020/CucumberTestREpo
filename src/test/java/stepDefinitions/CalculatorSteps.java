package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CalculatorSteps {
	
	int result;
	
	@Given("I have a calculator")
	public void i_have_a_calculator() {
	    System.out.println("Inside Calculator");
	}

	@When("I add {int} and {int}")
	public void i_add_and(int num1, int num2) {
	    result = num1 + num2;
	}

	@Then("I should get the value as {int}")
	public void i_should_get_the_value_as(int res) {
	    Assert.assertEquals(res, result);
	}

	@When("I substract {int} and {int}")
	public void i_substract_and(int num1, int num2) {
	    result = num1 - num2;
	}
	
	@When("I add")
	public void i_add(io.cucumber.datatable.DataTable dataTable) {
		int rows = dataTable.height();
		for(int i = 0 ; i<rows; i++) {
			result = result + Integer.parseInt(dataTable.cell(i, 0));
		}
	}

	@When("I add using list")
	public void i_add_using_list(List<Integer> numbers) {
	    for(Integer num: numbers) {
	    	result = result + num;
	    }
	}
	
	@When("I orderd")
	public void i_orderd(Map<String, Integer> totalPrice ) {
	    for(String key: totalPrice.keySet()){
	    	result = result + totalPrice.get(key);
	    }
	}
	
	@When("I orderd below item and quantity")
	public void i_orderd_below_item_and_quantity(io.cucumber.datatable.DataTable dataTable) {
		int rows = dataTable.height();
		for(int i = 0 ; i<rows; i++) {
			int quantity = Integer.parseInt(dataTable.cell(i, 1));
			int price = Integer.parseInt(dataTable.cell(i, 2));
			result = result + quantity * price;
		}
	}
	
}
