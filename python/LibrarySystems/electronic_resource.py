class ElectronicResource:
    def __init__(self):
        self.devices = []
    # The class represents an electronic resource

    def get_devices(self):
        return self.devices
    # Returns a list of devices

    def set_devices(self, devices):
        self.devices = devices
    # Sets the list of devices

    def print_details(self):
        for device in self.devices:
            device.print_device_details()
    # Returns all electronic devices in the list

    def add_device(self, device):
        self.devices.append(device)
    # Method accepts device, appends the device to end of list







