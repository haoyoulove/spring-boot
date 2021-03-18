package org.springframework.boot.example.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yangjing
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {

	String body;

}
