package com.jiker.workorderms.service;

import com.jiker.workorderms.bean.WorkOrderPlan;
import com.jiker.workorderms.dao.WorkOrderPlanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountWorkOrderPlanService {

    @Autowired
    private WorkOrderPlanDao workOrderPlanDao;
    /**
     * 统计某个时间段内的工单计划数
     * @param workOrderPlan
     * @return
     */
    public List<WorkOrderPlan> queryWorkOrderPlanForTimeRegin(WorkOrderPlan workOrderPlan){
        List<WorkOrderPlan> workOrderPlanList=new ArrayList<WorkOrderPlan>();
        //调用Dao层queryWorkOrderPlanForTimeRegin查询数据
        workOrderPlanList=workOrderPlanDao.queryWorkOrderPlanForTimeRegin(workOrderPlan);
        return workOrderPlanList;
    }
}
