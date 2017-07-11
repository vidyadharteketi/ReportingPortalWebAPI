package com.onboarding.webapi.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onboarding.webapi.adapter.IControlGroupServiceAdapter;
import com.onboarding.webapi.bean.ControlGroupBean;
import com.onboarding.webapi.response.vo.ControlGroupVO;
import com.onboarding.webapi.responsewrapper.vo.CustomControlGroupListVO;
import com.onboarding.webapi.responsewrapper.vo.CustomControlGroupOutputVO;
import com.onboarding.webapi.responsewrapper.vo.CustomControlGroupVO;
import com.onboarding.webapi.util.CommonConstants;

@Component
@Path(value=CommonConstants.CONTROL_GROUP_SERVICE)
public class ControlGroupService {
	
	private final Logger logger = Logger.getLogger(ControlGroupService.class);
	
	@Autowired
	private IControlGroupServiceAdapter iControlGroupServiceAdapter;
	
	@Path(CommonConstants.ADD_CONTROL_GROUP)
	@POST
	@Produces( { MediaType.APPLICATION_JSON})
	public Response processAddControlGroupData(final ControlGroupBean controlGroupBean) throws Exception {

		if (logger.isDebugEnabled()) {
			logger.debug("START :: ControlGroupService : insertControlGroupData : Method to insertControlGroupData");
		}
		CustomControlGroupOutputVO customControlGroupOutputVO = new CustomControlGroupOutputVO();
		Integer result = null;
		try {
			result = iControlGroupServiceAdapter.processAddControlGroupData(controlGroupBean);

		} catch (Exception e) {
			logger.error("Error while invoking insertControlGroupData : " + e.getMessage());
		}
		if (logger.isDebugEnabled()) {
			logger.debug("END :: ControlGroupService : insertControlGroupData : Method to insertControlGroupData");
		}
		customControlGroupOutputVO.setResult(result);
		
		return Response.ok(customControlGroupOutputVO).build();
	}
	
	@Path(CommonConstants.UPDATE_CONTROL_GROUP)
	@PUT
	@Produces( { MediaType.APPLICATION_JSON})
	public Response processUpdateControlGroupData(final ControlGroupBean controlGroupBean) {

		if (logger.isDebugEnabled()) {
			logger.debug("START :: ControlGroupService : updateControlGroupData : Method to updateControlGroupData");
		}
		CustomControlGroupOutputVO customControlGroupOutputVO = new CustomControlGroupOutputVO();
		Integer result = null;
		try {
			result = iControlGroupServiceAdapter.processUpdateControlGroupData(controlGroupBean);

		} catch (Exception e) {
			logger.error("Error while invoking updateControlGroupData : " + e.getMessage());
		}
		if (logger.isDebugEnabled()) {
			logger.debug("END :: ControlGroupService : updateControlGroupData : Method to updateControlGroupData");
		}
		customControlGroupOutputVO.setResult(result);
		
		return Response.ok(customControlGroupOutputVO).build();

	}
	
	@Path(CommonConstants.DELETE_CONTROL_GROUP)
	@PUT
	@Produces( { MediaType.APPLICATION_JSON})
	public Response processDeleteControlGroupData(@QueryParam("ControlGroupId") String controlGroupId,
			@QueryParam("ControlGroupName") String controlGroupName) {

		if (logger.isDebugEnabled()) {
			logger.debug("START :: ControlGroupService : deleteControlGroupData : Method to deleteControlGroupData");
		}
		CustomControlGroupOutputVO customControlGroupOutputVO = new CustomControlGroupOutputVO();
		Integer result = null;
		try {
			result = iControlGroupServiceAdapter.processDeleteControlGroupData(controlGroupId,
					controlGroupName);
		} catch (Exception e) {
			logger.error("Error while invoking deleteControlGroupData : " + e.getMessage());
		}
		if (logger.isDebugEnabled()) {
			logger.debug("END :: ControlGroupService : deleteControlGroupData : Method to deleteControlGroupData");
		}
		customControlGroupOutputVO.setResult(result);
		
		return Response.ok(customControlGroupOutputVO).build();

	}

	@Path(CommonConstants.LOAD_ALL_CONTROL_GROUP)
	@GET
	@Produces( { MediaType.APPLICATION_JSON})
	public Response processLoadAllControlGroupData() {

		if (logger.isDebugEnabled()) {
			logger.debug("START :: ControlGroupService : LoadAllControlGroupData : Method to LoadAllControlGroupData");
		}
		CustomControlGroupListVO customControlGroupListVO = new CustomControlGroupListVO();
		List<ControlGroupVO> controlGroupList = new ArrayList<>();
		try {
			controlGroupList = iControlGroupServiceAdapter.processLoadAllControlGroupData();
		} catch (Exception e) {
			logger.error("Error while invoking LoadAllControlGroupData : " + e.getMessage());
		}
		if (logger.isDebugEnabled()) {
			logger.debug("END :: ControlGroupService : LoadAllControlGroupData : Method to LoadAllControlGroupData");
		}
		customControlGroupListVO.setControlGroupVO(controlGroupList);
		
		return Response.ok(customControlGroupListVO).build();

	}
	
	@Path(CommonConstants.LOAD_CONTROL_GROUP)
	@GET
	@Produces( { MediaType.APPLICATION_JSON})
	public Response processLoadControlGroupByUniqueKeys(@QueryParam("ControlGroupId") String controlGroupId,
			@QueryParam("ControlGroupName") String controlGroupName) {

		if (logger.isDebugEnabled()) {
			logger.debug("START :: ControlGroupService : LoadControlGroupByUniqueKeys : Method to LoadControlGroupByUniqueKeys");
		}
		CustomControlGroupVO customControlGroupVO = new CustomControlGroupVO();
		ControlGroupVO controlGroup = new ControlGroupVO();
		try {
			controlGroup = iControlGroupServiceAdapter.processLoadControlGroupByUniqueKeys(controlGroupId,
					controlGroupName);
		} catch (Exception e) {
			logger.error("Error while invoking LoadControlGroupByUniqueKeys : " + e.getMessage());
		}
		if (logger.isDebugEnabled()) {
			logger.debug("END :: ControlGroupService : LoadControlGroupByUniqueKeys : Method to LoadControlGroupByUniqueKeys");
		}
		customControlGroupVO.setControlGroup(controlGroup);
		
		return Response.ok(customControlGroupVO).build();

	}
	
	
}