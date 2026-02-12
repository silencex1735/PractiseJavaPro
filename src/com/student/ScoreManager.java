package com.student;

import java.util.HashMap;
import java.util.Map;

/**
 * 学生成绩管理类（企业级注释规范：类用途、作者、日期）
 *
 * @author silencex1735
 * @date 2026-02-12
 */
public class ScoreManager {
    // 模拟成绩数据
    private static Map<String, Integer> scoreMap = new HashMap<>();

    static {
        scoreMap.put("2024001", 95);
        scoreMap.put("2024002", 88);
    }


    /**
     * 根据学号查询学生成绩
     *
     * @param studentId 学号（非空）
     * @return 成绩（-1 表示学号不存在）
     */
    public int getScoreByStudentId(String studentId) {
        // 企业级校验：非空判断
        if (studentId == null || studentId.isEmpty()) {
            throw new IllegalArgumentException("学号不能为空");
        }
        return scoreMap.getOrDefault(studentId, -1);
    }

}
