package com.example.bff;

import lombok.*;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class BffResponse<T> {
    T data;
    String error;
}
