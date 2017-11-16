package mx.com.ejemplo.webapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ejemplo.webapp.beans.IataCodesResponse;
import mx.com.ejemplo.webapp.beans.ListIataCodes;
import mx.com.ejemplo.webapp.dao.entity.IataCodes;
import mx.com.ejemplo.webapp.dao.interfaces.IataDao;

@Service("iataService")
public class IataServiceImpl implements IataService {
	@Autowired
	private IataDao iataDao;
	
	@Override
	public ListIataCodes getList() {
		ListIataCodes response = new ListIataCodes();
		List<IataCodesResponse> listResponse = new ArrayList<>();
		
		List<IataCodes> codes = iataDao.getAll();
		if (codes.isEmpty()) {
			response.setListResponse(null);
			response.setMsg("No Existen Elementos");
			response.setSuccess(true);
		} else {
			for (IataCodes code : codes) {
				listResponse.add(new IataCodesResponse(code.getId(), code.getCode(), code.getCountryCode(), code.getName()));
			}
			
			response.setListResponse(listResponse);
			response.setMsg("");
			response.setSuccess(true);
		}
		
		
		
		
		return response;
	}

}
