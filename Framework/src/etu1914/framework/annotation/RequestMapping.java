/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu1914.framework.annotation;

/**
 *
 * @author Daniella
 */
import java.lang.annotation.*;
/**
 *
 * @author ONEF
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {
    String path();
}
