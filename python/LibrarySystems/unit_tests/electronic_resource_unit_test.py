import unittest
from electronic_resource import ElectronicResource
from electronic_device import ElectronicDevice


class TestElectronicResource(unittest.TestCase):
    # A unit test for class Electronic Resource

    def test_get_set_devices(self):
        test_resources = ElectronicResource()
        self.assertTrue(test_resources.get_devices() == test_resources.devices)

        self.assertTrue(test_resources.devices == [])
        test_resources.set_devices(["Test List"])
        self.assertTrue(test_resources.devices == ["Test List"])
        # Test get and set for list of devices

    def test_print_details(self):
        test_resources = ElectronicResource()
        test_device = ElectronicDevice("TestLocation", True)
        test_resources.add_device(test_device)

        test_resources.print_details()
        # manual comparision needed

    def test_add_devices(self):
        test_resources = ElectronicResource()
        self.assertTrue(test_resources.devices == [])

        test_device = ElectronicDevice("TestLocation", True)

        test_resources.add_device(test_device)
        self.assertTrue(test_resources.devices[0] == test_device)
        # Test accepts device, appends the object to end of lis


if __name__ == '__main__':
    unittest.main()
