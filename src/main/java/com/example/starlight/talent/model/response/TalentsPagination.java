package com.example.starlight.talent.model.response;

import lombok.Builder;

import java.util.List;

@Builder
public record TalentsPagination(
        int totalPage,
        long totalTalents,
        List<TalentShort> talents
) {
}
