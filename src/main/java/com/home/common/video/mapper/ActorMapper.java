package com.home.common.video.mapper;

import com.home.common.video.dao.ActorDao;
import com.home.common.video.dto.ActorDto;
import org.springframework.stereotype.Component;

@Component
public class ActorMapper {

    public ActorDto toDto(final ActorDao actorDao) {
        return new ActorDto(
                actorDao.getId(),
                actorDao.getName(),
                actorDao.getStatus(),
                actorDao.getCreatedAt(),
                actorDao.getUpdatedAt());
    }

    public ActorDao toEntity(final ActorDto actorDto) {
        ActorDao actorDao = new ActorDao();

        actorDao.setId(actorDto.id());
        actorDao.setName(actorDto.name());
        actorDao.setStatus(actorDto.status());
        actorDao.setCreatedAt(actorDto.createdAt());
        actorDao.setUpdatedAt(actorDto.updatedAt());

        return actorDao;
    }
}
