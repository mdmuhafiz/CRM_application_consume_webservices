package com.searchlead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.searchlead.dto.Lead;

@Controller
public class SearchLeadController {
	@RequestMapping("/viewleadpage")
	public String showSearchPage() {
		return "search_lead";
		
	}
	@RequestMapping("/getLeadInfo")
	public String getLeadInfo(@RequestParam("id") long id,ModelMap modelMap) {
		LeadRestClient client = new LeadRestClient();
		Lead lead = client.getLeadInfo(id);
		if(lead !=null) {
			modelMap.addAttribute("lead", lead);
			return "lead_result";
		}else {
			modelMap.addAttribute("error", "No record is Found");
			return "lead_result";
		}
		
	}

}
