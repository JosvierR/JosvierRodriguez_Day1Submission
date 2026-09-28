# Task 2

## Question

(Vehicle Fleet Management System): Create a base class `Vehicle` (`make`, `model`, `year`, method `getSpecs()`). Derive `Car` (adds `numDoors`) and `ElectricTruck` (adds `batteryCapacity`, `payloadCapacity`). Override `getSpecs()` in all subclasses to return formatted details.

## How I understand it

Vehicle has the basic information that every vehicle needs. Then Car and ElectricTruck inherit that information and add their own things. They both override getSpecs() so each vehicle can show its own information.

## Verified output

```text
2025 Toyota Camry | Doors: 4
2026 Tesla Semi | Battery: 500.0 kWh | Payload: 36000.0 kg
```
