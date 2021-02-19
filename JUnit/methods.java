assertTrue(result);
assertFalse(result);
assertEquals(false, service.isValidMobileNumber(null));
assertEquals(true, service.isValidMobileNumber("+1-1234567890"));