package com.example.mp.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Dept implements Serializable {

    private static final long serialVersionUID=1L;

    private String name;

    private String mobile;

    private Long managerId;


}
