package logistics.giaglobal.app.shipmentstage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipmentStageController {

	@Autowired
	private ShipmentStageService shipmentStageService;

	@RequestMapping(method = RequestMethod.POST, value="/shipmentstages")
	public List<ShipmentStage> addShipmentStages(@RequestBody List<ShipmentStage> shipmentStages) {
		return shipmentStageService.addShipmentStages(shipmentStages);
	}


}
