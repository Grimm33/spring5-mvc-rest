package ccbill.training.api.v1.mapper;

import ccbill.training.api.v1.model.VendorDTO;
import ccbill.training.domain.Vendor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendorMapperTest {

    public static final String NAME = "someName";

    VendorMapper vendorMapper = VendorMapper.INSTANCE;

    @Test
    public void  vendorToVendorDTO() {
        Vendor vendor = new Vendor();
        vendor.setName(NAME);

        VendorDTO vendorDTO = vendorMapper.vendorToVendorDto(vendor);

        assertEquals(vendor.getName(), vendorDTO.getName());
    }

    @Test
    public void  vendorDTOToVendor() {
        VendorDTO vendorDTO = new VendorDTO();
        vendorDTO.setName(NAME);

        Vendor vendor = vendorMapper.vendorDtoToVendor(vendorDTO);

        assertEquals(vendorDTO.getName(), vendor.getName());
    }
}