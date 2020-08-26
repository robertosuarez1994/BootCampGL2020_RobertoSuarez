package com.globallogic.bootcampgl.vehiculo.DTO;

import java.util.Date;

import lombok.Data;

@Data
public class VehicleDTO {
	private Long code;
	private String identification;
	private Date prod_date;
	private Long model_id;
	private Long type_id;
}
