package org.example.universitymanagementsystem.mapper;

import org.example.universitymanagementsystem.dto.CreateStudentDTO;
import org.example.universitymanagementsystem.dto.StudentDTO;
import org.example.universitymanagementsystem.repository.entity.StudentEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    List<StudentDTO> toStudentDTOList(List<StudentEntity> studentEntities);
    StudentEntity toStudentEntity(CreateStudentDTO createStudentDTO);
}
