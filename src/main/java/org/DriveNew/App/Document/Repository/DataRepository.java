package org.DriveNew.App.Document.Repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class DataRepository {

	public Map<String,String> getPrivileges() {
		
		Map<String,String> privMap = new HashMap<String,String>();
		privMap.put("Upload", "Upload");
		privMap.put("Share", "Share");
		privMap.put("Download", "Download");
		privMap.put("FolderLock", "Folder Lock");
		return privMap;
	}
}
