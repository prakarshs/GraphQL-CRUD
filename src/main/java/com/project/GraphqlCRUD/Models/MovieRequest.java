package com.project.GraphqlCRUD.Models;

import jdk.jfr.Name;
import lombok.*;

@Getter
@Setter
public class MovieRequest {
   private String movieName;
   private String movieDirector;
   private Long movieYear;
   private Long movieRating;
}
