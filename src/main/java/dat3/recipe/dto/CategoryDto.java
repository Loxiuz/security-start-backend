package dat3.recipe.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import dat3.recipe.entity.Category;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryDto {
    private int id;
    private String name;
    private LocalDateTime created;
    private LocalDateTime edited;

    public CategoryDto(Category c){
        this.id = c.getId();
        this.name = c.getName();
        this.created = c.getCreated();
        this.edited = c.getEdited();
    }
}
