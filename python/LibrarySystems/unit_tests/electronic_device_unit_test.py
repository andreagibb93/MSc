import unittest
from electronic_device import ElectronicDevice

class TestElectronicDevice(unittest.TestCase):
    # A unit test for class Electronic Device

    def test_get_set_location(self):
        test_device = ElectronicDevice("TestLocation", True)
        self.assertTrue(test_device.get_location() == test_device.location)

        self.assertTrue(test_device.location == "TestLocation")
        test_device.set_location("ChangedLocation")
        self.assertTrue(test_device.location == "ChangedLocation")
        # Test get and set for location

    def test_get_set_available(self):
        test_device = ElectronicDevice("TestLocatioin", True)
        self.assertTrue(test_device.get_available() is True)

        self.assertTrue(test_device.available == True)
        test_device.set_available(False)
        self.assertTrue(test_device.available == False)
        # Test get and set for available

    def test_print_device_details(self):
        test_device = ElectronicDevice("location", True)
        test_device.print_device_details()
        # manual comparision needed

if __name__ == '__main__':
    unittest.main()


