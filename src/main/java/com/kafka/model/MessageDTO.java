/**
 * 
 */
package com.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Snehooooo
 *
 */
@Data
@AllArgsConstructor
public class MessageDTO {
	
	String id;
	String name;
	String message;

}
