import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.jxls.exception.ParsePropertyException;
import net.sf.jxls.transformer.XLSTransformer;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		final String PATH_TEMPLATE = "people_template.xls";
		final String PATH_FILENAME = "people_exported.xls";
		
		List<Employee> list = new LinkedList<>();
		list.add(new Employee("Jose", new Date(80, 5, 20), 1661));
		list.add(new Employee("Odair", new Date(75, 3, 15), 2622));
		list.add(new Employee("Malfoy", new Date(83, 7, 3), 1622));
		list.add(new Employee("Aragorn", new Date(1, 2, 2), 3000));
		list.add(new Employee("Gandalf", new Date(0, 1, 1), 4100));
		
		Map<String, Object> beanParams = new HashMap<>();
		beanParams.put("employees", list);
		
		XLSTransformer transf = new XLSTransformer();
		try {
			transf.transformXLS(PATH_TEMPLATE, beanParams, PATH_FILENAME);
		} catch(ParsePropertyException | InvalidFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
