package ai.ecma.codingbat.payload;


import lombok.*;
import ai.ecma.codingbat.entity.Language;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddLanguageDTO {

    @NotBlank(message = "Title must be not blank")
    private String title;

    public Language get() {
        return new Language(title);
    }

}