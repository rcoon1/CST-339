package com.gcu.topic22.business;

import com.gcu.topic22.model.OrderModel;
import java.util.List;
import com.gcu.topic22.model.OrdersList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/service")
public class OrdersRestService
{
	@Autowired
	private OrdersBusinessServiceInterface service;

	@GetMapping(path="/getjson", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<OrderModel> getOrdersAsJson()
	{
		return service.getOrders();
	}

	@GetMapping(path="/getxml", produces= {MediaType.APPLICATION_XML_VALUE})
	public OrdersList getOrderAsXml()
	{
		OrdersList list = new OrdersList();
		list.setOrders(service.getOrders());
		return list;
	}
	
	@GetMapping(path="/getorder/{id}")
	public ResponseEntity<?> getOrder(@PathVariable("id") String id)
	{
		try
		{
			OrderModel orders = service.getOrderById(id);
			if(orders == null)
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			else
				return new ResponseEntity<>(orders, HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}